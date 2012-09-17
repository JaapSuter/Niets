.class public Lcom/whatsapp/SetStatus;
.super Lcom/whatsapp/DialogToastActivity;
.source "SetStatus.java"


# static fields
.field static g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field static i:I

.field private static j:Lcom/whatsapp/SetStatus;

.field static o:I

.field static p:I

.field static q:I

.field private static final z:[Ljava/lang/String;


# instance fields
.field f:Landroid/widget/TextView;

.field h:Lcom/whatsapp/ke;

.field private k:Ljava/lang/String;

.field l:Landroid/os/Handler;

.field m:Landroid/os/Handler;

.field private n:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v1, 0x6d

    const/16 v4, 0x6b

    const/16 v2, 0x21

    const/16 v3, 0x1b

    const/4 v8, 0x0

    const/4 v0, 0x4

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0005\u0019@o\u001e\u0005"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_0
    if-gt v6, v7, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    const/4 v10, 0x1

    const-string v0, "\u0005\u0008Uh\u001f\u0017\u0019ThD\u0005\u0019@o\u001e\u0005\u0018Q\u007f\n\u0002\u0008E4\u001f\u0013\u0000Qh\u001f\u0017\u0019ThK\u001f\u001e\u0001u\u001e\u001a\u0001"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x2

    const-string v0, "\u0005\u0019@o\u001e\u0005BBi\u000e\u0017\u0019D"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2
    if-gt v6, v7, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x3

    const-string v0, "\u0015\u001fDz\u001f\u0013BRo\n\u0002\u0018R4\u0018\u0013\u001fHz\u0007\u001f\u0017@o\u0002\u0019\u0003~~\u0019\u0004\u0002S"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_3
    if-gt v6, v7, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    sput-object v9, Lcom/whatsapp/SetStatus;->z:[Ljava/lang/String;

    .line 41
    const/4 v0, -0x1

    sput v0, Lcom/whatsapp/SetStatus;->i:I

    .line 11
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/SetStatus;->j:Lcom/whatsapp/SetStatus;

    .line 71
    sput v8, Lcom/whatsapp/SetStatus;->o:I

    .line 79
    const/4 v0, 0x1

    sput v0, Lcom/whatsapp/SetStatus;->p:I

    .line 12
    const/4 v0, 0x2

    sput v0, Lcom/whatsapp/SetStatus;->q:I

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_4
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x76

    goto :goto_4

    :pswitch_1
    move v0, v1

    goto :goto_4

    :pswitch_2
    move v0, v2

    goto :goto_4

    :pswitch_3
    move v0, v3

    goto :goto_4

    :cond_1
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_5
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_1

    :pswitch_4
    const/16 v0, 0x76

    goto :goto_5

    :pswitch_5
    move v0, v1

    goto :goto_5

    :pswitch_6
    move v0, v2

    goto :goto_5

    :pswitch_7
    move v0, v3

    goto :goto_5

    :cond_2
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_6
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_2

    :pswitch_8
    const/16 v0, 0x76

    goto :goto_6

    :pswitch_9
    move v0, v1

    goto :goto_6

    :pswitch_a
    move v0, v2

    goto :goto_6

    :pswitch_b
    move v0, v3

    goto :goto_6

    :cond_3
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_7
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_3

    :pswitch_c
    const/16 v0, 0x76

    goto :goto_7

    :pswitch_d
    move v0, v1

    goto :goto_7

    :pswitch_e
    move v0, v2

    goto :goto_7

    :pswitch_f
    move v0, v3

    goto :goto_7

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
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/whatsapp/DialogToastActivity;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/SetStatus;->k:Ljava/lang/String;

    .line 13
    new-instance v0, Lcom/whatsapp/sd;

    invoke-direct {v0, p0}, Lcom/whatsapp/sd;-><init>(Lcom/whatsapp/SetStatus;)V

    iput-object v0, p0, Lcom/whatsapp/SetStatus;->l:Landroid/os/Handler;

    .line 62
    new-instance v0, Lcom/whatsapp/td;

    invoke-direct {v0, p0}, Lcom/whatsapp/td;-><init>(Lcom/whatsapp/SetStatus;)V

    iput-object v0, p0, Lcom/whatsapp/SetStatus;->m:Landroid/os/Handler;

    .line 29
    return-void
.end method

.method static a(Lcom/whatsapp/SetStatus;)V
    .locals 0
    .parameter

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/whatsapp/SetStatus;->h()V

    return-void
.end method

.method static b(Lcom/whatsapp/SetStatus;)Landroid/view/View;
    .locals 1
    .parameter

    .prologue
    .line 91
    iget-object v0, p0, Lcom/whatsapp/SetStatus;->n:Landroid/view/View;

    return-object v0
.end method

.method static f()Lcom/whatsapp/SetStatus;
    .locals 1

    .prologue
    .line 10
    sget-object v0, Lcom/whatsapp/SetStatus;->j:Lcom/whatsapp/SetStatus;

    return-object v0
.end method

.method private g()Z
    .locals 8

    .prologue
    const/4 v1, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 57
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/whatsapp/SetStatus;->getFilesDir()Ljava/io/File;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/SetStatus;->z:[Ljava/lang/String;

    const/4 v5, 0x0

    aget-object v4, v4, v5

    invoke-direct {v0, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    new-instance v3, Ljava/io/ObjectInputStream;

    sget-object v0, Lcom/whatsapp/SetStatus;->z:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v0, v0, v4

    invoke-virtual {p0, v0}, Lcom/whatsapp/SetStatus;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 119
    invoke-virtual {v3}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 85
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    sput-object v4, Lcom/whatsapp/SetStatus;->g:Ljava/util/ArrayList;

    .line 109
    const-string v4, "\n"

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    array-length v5, v4

    move v0, v1

    :cond_0
    if-ge v0, v5, :cond_2

    aget-object v6, v4, v0

    .line 23
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_1

    .line 59
    sget-object v7, Lcom/whatsapp/SetStatus;->g:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    :cond_1
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_0

    .line 3
    :cond_2
    invoke-virtual {v3}, Ljava/io/ObjectInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 38
    const/4 v0, 0x1

    .line 121
    :goto_0
    return v0

    .line 49
    :catch_0
    move-exception v0

    .line 82
    sget-object v2, Lcom/whatsapp/SetStatus;->z:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-static {v2, v0}, Lcom/whatsapp/g5;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    move v0, v1

    .line 121
    goto :goto_0

    .line 112
    :catch_1
    move-exception v0

    .line 48
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method private h()V
    .locals 6

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 45
    :try_start_0
    new-instance v2, Ljava/io/ObjectOutputStream;

    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v3, Lcom/whatsapp/SetStatus;->z:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Lcom/whatsapp/App;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    sget-object v0, Lcom/whatsapp/SetStatus;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 5
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "\n"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_0

    .line 92
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 130
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 47
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 33
    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 76
    :goto_0
    return-void

    .line 138
    :catch_0
    move-exception v0

    .line 51
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    goto :goto_0

    .line 110
    :catch_1
    move-exception v0

    .line 83
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method a()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 128
    iget-object v0, p0, Lcom/whatsapp/SetStatus;->l:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 80
    iget-object v0, p0, Lcom/whatsapp/SetStatus;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 31
    iget-object v0, p0, Lcom/whatsapp/SetStatus;->k:Ljava/lang/String;

    sput-object v0, Lcom/whatsapp/App;->a:Ljava/lang/String;

    .line 9
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/SetStatus;->k:Ljava/lang/String;

    .line 93
    iget-object v0, p0, Lcom/whatsapp/SetStatus;->l:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 42
    :cond_0
    sget-object v0, Lcom/whatsapp/SetStatus;->z:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 72
    :cond_1
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4
    .parameter

    .prologue
    .line 63
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/whatsapp/SetStatus;->showDialog(I)V

    .line 123
    iput-object p1, p0, Lcom/whatsapp/SetStatus;->k:Ljava/lang/String;

    .line 81
    invoke-static {p1}, Lcom/whatsapp/App;->j(Ljava/lang/String;)V

    .line 140
    iget-object v0, p0, Lcom/whatsapp/SetStatus;->l:Landroid/os/Handler;

    const/4 v1, 0x0

    const-wide/16 v2, 0x7d00

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 99
    return-void
.end method

.method b()V
    .locals 2

    .prologue
    .line 122
    iget-object v0, p0, Lcom/whatsapp/SetStatus;->m:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 114
    iget-object v0, p0, Lcom/whatsapp/SetStatus;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 27
    return-void
.end method

.method c()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 88
    iget-object v0, p0, Lcom/whatsapp/SetStatus;->l:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 90
    iget-object v0, p0, Lcom/whatsapp/SetStatus;->l:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 19
    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    .line 61
    const v0, 0x7f0d00e0

    invoke-virtual {p0, v0}, Lcom/whatsapp/SetStatus;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 55
    const v0, 0x7f0d016a

    invoke-virtual {p0, v0}, Lcom/whatsapp/SetStatus;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    new-instance v0, Lcom/whatsapp/v9;

    iget-object v1, p0, Lcom/whatsapp/SetStatus;->m:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lcom/whatsapp/v9;-><init>(Landroid/os/Handler;)V

    .line 120
    invoke-virtual {v0}, Lcom/whatsapp/v9;->start()V

    .line 68
    return-void
.end method

.method public e()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 131
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 75
    invoke-virtual {p0}, Lcom/whatsapp/SetStatus;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v3, 0x7f07

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 37
    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->length()I

    move-result v4

    if-ge v0, v4, :cond_1

    .line 18
    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 53
    :cond_1
    return-object v2
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 124
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 98
    sget-object v0, Lcom/whatsapp/SetStatus;->z:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 28
    sget v1, Lcom/whatsapp/SetStatus;->o:I

    if-ne p1, v1, :cond_1

    .line 6
    sget-object v1, Lcom/whatsapp/SetStatus;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 60
    invoke-virtual {p0, v0}, Lcom/whatsapp/SetStatus;->a(Ljava/lang/String;)V

    .line 113
    :cond_0
    :goto_0
    return-void

    .line 103
    :cond_1
    sget v1, Lcom/whatsapp/SetStatus;->i:I

    if-ltz v1, :cond_2

    .line 50
    sget-object v1, Lcom/whatsapp/SetStatus;->g:Ljava/util/ArrayList;

    sget v2, Lcom/whatsapp/SetStatus;->i:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 4
    sget-object v1, Lcom/whatsapp/SetStatus;->g:Ljava/util/ArrayList;

    sget v2, Lcom/whatsapp/SetStatus;->i:I

    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 117
    :cond_2
    sget v1, Lcom/whatsapp/SetStatus;->q:I

    if-ne p1, v1, :cond_0

    .line 132
    invoke-virtual {p0, v0}, Lcom/whatsapp/SetStatus;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x1

    .line 64
    invoke-interface {p1}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 74
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 136
    :goto_0
    return v2

    .line 67
    :pswitch_0
    sget-object v1, Lcom/whatsapp/SetStatus;->g:Ljava/util/ArrayList;

    iget v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 40
    const/4 v0, -0x1

    sput v0, Lcom/whatsapp/SetStatus;->i:I

    .line 25
    iget-object v0, p0, Lcom/whatsapp/SetStatus;->h:Lcom/whatsapp/ke;

    invoke-virtual {v0}, Lcom/whatsapp/ke;->notifyDataSetChanged()V

    .line 52
    invoke-direct {p0}, Lcom/whatsapp/SetStatus;->h()V

    goto :goto_0

    .line 74
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .parameter

    .prologue
    .line 70
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreate(Landroid/os/Bundle;)V

    .line 94
    sget-object v0, Lcom/whatsapp/SetStatus;->z:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 96
    const v0, 0x7f030054

    invoke-virtual {p0, v0}, Lcom/whatsapp/SetStatus;->setContentView(I)V

    .line 86
    const v0, 0x7f0d0169

    invoke-virtual {p0, v0}, Lcom/whatsapp/SetStatus;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/SetStatus;->n:Landroid/view/View;

    .line 137
    sget-boolean v0, Lcom/whatsapp/App;->b:Z

    if-nez v0, :cond_0

    .line 22
    invoke-virtual {p0}, Lcom/whatsapp/SetStatus;->d()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 126
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/SetStatus;->n:Landroid/view/View;

    new-instance v1, Lcom/whatsapp/o2;

    invoke-direct {v1, p0}, Lcom/whatsapp/o2;-><init>(Lcom/whatsapp/SetStatus;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    :cond_1
    const v0, 0x7f0d0072

    invoke-virtual {p0, v0}, Lcom/whatsapp/SetStatus;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/SetStatus;->f:Landroid/widget/TextView;

    .line 56
    sget-object v0, Lcom/whatsapp/App;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/whatsapp/SetStatus;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    .line 36
    iget-object v1, p0, Lcom/whatsapp/SetStatus;->f:Landroid/widget/TextView;

    if-nez v0, :cond_2

    sget-object v0, Lcom/whatsapp/App;->a:Ljava/lang/String;

    :cond_2
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    invoke-direct {p0}, Lcom/whatsapp/SetStatus;->g()Z

    move-result v0

    if-nez v0, :cond_3

    .line 97
    invoke-virtual {p0}, Lcom/whatsapp/SetStatus;->e()Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/SetStatus;->g:Ljava/util/ArrayList;

    .line 14
    :cond_3
    const v0, 0x7f0d016b

    invoke-virtual {p0, v0}, Lcom/whatsapp/SetStatus;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 16
    const v1, 0x7f0d016c

    invoke-virtual {p0, v1}, Lcom/whatsapp/SetStatus;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 65
    new-instance v1, Lcom/whatsapp/ke;

    const v2, 0x7f0d016d

    sget-object v3, Lcom/whatsapp/SetStatus;->g:Ljava/util/ArrayList;

    invoke-direct {v1, p0, p0, v2, v3}, Lcom/whatsapp/ke;-><init>(Lcom/whatsapp/SetStatus;Landroid/content/Context;ILjava/util/ArrayList;)V

    iput-object v1, p0, Lcom/whatsapp/SetStatus;->h:Lcom/whatsapp/ke;

    .line 125
    iget-object v1, p0, Lcom/whatsapp/SetStatus;->h:Lcom/whatsapp/ke;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 127
    new-instance v1, Lcom/whatsapp/p2;

    invoke-direct {v1, p0}, Lcom/whatsapp/p2;-><init>(Lcom/whatsapp/SetStatus;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 111
    invoke-virtual {p0, v0}, Lcom/whatsapp/SetStatus;->registerForContextMenu(Landroid/view/View;)V

    .line 20
    sput-object p0, Lcom/whatsapp/SetStatus;->j:Lcom/whatsapp/SetStatus;

    .line 39
    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 3
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 135
    invoke-super {p0, p1, p2, p3}, Lcom/whatsapp/DialogToastActivity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 118
    const/4 v0, 0x1

    const v1, 0x7f09014e

    invoke-virtual {p0, v1}, Lcom/whatsapp/SetStatus;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 43
    return-void
.end method

.method public onCreateDialog(I)Landroid/app/Dialog;
    .locals 8
    .parameter

    .prologue
    const v1, 0x7f090154

    const/4 v2, 0x1

    const/4 v5, 0x0

    .line 66
    sparse-switch p1, :sswitch_data_0

    .line 141
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    :goto_0
    return-object v0

    .line 35
    :sswitch_0
    invoke-virtual {p0, v1}, Lcom/whatsapp/SetStatus;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f090155

    invoke-virtual {p0, v1}, Lcom/whatsapp/SetStatus;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1, v2, v5}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    goto :goto_0

    .line 17
    :sswitch_1
    const v0, 0x7f090156

    invoke-virtual {p0, v0}, Lcom/whatsapp/SetStatus;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f090157

    invoke-virtual {p0, v1}, Lcom/whatsapp/SetStatus;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1, v2, v5}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    goto :goto_0

    .line 21
    :sswitch_2
    new-instance v4, Lcom/whatsapp/n2;

    invoke-direct {v4, p0}, Lcom/whatsapp/n2;-><init>(Lcom/whatsapp/SetStatus;)V

    .line 107
    new-instance v0, Lcom/whatsapp/b;

    const v2, 0x7f09014d

    sget-object v3, Lcom/whatsapp/App;->a:Ljava/lang/String;

    const v7, 0x7f0902a2

    move-object v1, p0

    move v6, v5

    invoke-direct/range {v0 .. v7}, Lcom/whatsapp/b;-><init>(Landroid/app/Activity;ILjava/lang/String;Lcom/whatsapp/ms;III)V

    goto :goto_0

    .line 133
    :sswitch_3
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 134
    invoke-virtual {p0, v1}, Lcom/whatsapp/SetStatus;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 54
    invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 104
    invoke-virtual {v0, v5}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto :goto_0

    .line 66
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_3
        0x32 -> :sswitch_2
    .end sparse-switch
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 32
    const v0, 0x7f09014f

    invoke-interface {p1, v1, v1, v1, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const v1, 0x7f0203c4

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 102
    const/4 v0, 0x1

    return v0
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 100
    invoke-super {p0}, Lcom/whatsapp/DialogToastActivity;->onDestroy()V

    .line 30
    sget-object v0, Lcom/whatsapp/SetStatus;->j:Lcom/whatsapp/SetStatus;

    if-ne v0, p0, :cond_0

    .line 106
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/SetStatus;->j:Lcom/whatsapp/SetStatus;

    .line 46
    :cond_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2
    .parameter

    .prologue
    const/4 v1, 0x1

    .line 8
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 129
    :goto_0
    return v1

    .line 69
    :pswitch_0
    sget-object v0, Lcom/whatsapp/SetStatus;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 78
    invoke-direct {p0}, Lcom/whatsapp/SetStatus;->h()V

    .line 139
    iget-object v0, p0, Lcom/whatsapp/SetStatus;->h:Lcom/whatsapp/ke;

    invoke-virtual {v0}, Lcom/whatsapp/ke;->notifyDataSetChanged()V

    goto :goto_0

    .line 8
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
