.class public Lcom/whatsapp/ac;
.super Landroid/os/AsyncTask;
.source "ac.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Object;",
        "Ljava/lang/Integer;",
        "Lcom/whatsapp/xf;",
        ">;"
    }
.end annotation


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field a:Z

.field b:Z

.field final c:Lcom/whatsapp/VerifyMessageStoreActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v2, 0x64

    const/16 v4, 0x36

    const/16 v3, 0x33

    const/16 v1, 0x21

    const/4 v6, 0x0

    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "W\u0001\u0019ZPX\t\u0018TEU\u000b\u0019V\u0019R\u0011\u0008PSR\u0017"

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

    const/4 v8, 0x1

    const-string v0, "W\u0001\u0019ZPX\t\u0018TEU\u000b\u0019V\u0019G\u0005\u0002_SE"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/ac;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_2
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_2

    :pswitch_1
    move v0, v2

    goto :goto_2

    :pswitch_2
    const/16 v0, 0x6b

    goto :goto_2

    :pswitch_3
    move v0, v3

    goto :goto_2

    :cond_1
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_3

    :pswitch_5
    move v0, v2

    goto :goto_3

    :pswitch_6
    const/16 v0, 0x6b

    goto :goto_3

    :pswitch_7
    move v0, v3

    goto :goto_3

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
.end method

.method public constructor <init>(Lcom/whatsapp/VerifyMessageStoreActivity;ZZ)V
    .locals 1
    .parameter
    .parameter
    .parameter

    .prologue
    .line 42
    iput-object p1, p0, Lcom/whatsapp/ac;->c:Lcom/whatsapp/VerifyMessageStoreActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/ac;->a:Z

    .line 40
    iput-boolean p2, p0, Lcom/whatsapp/ac;->b:Z

    .line 10
    return-void
.end method

.method static a(Lcom/whatsapp/ac;[Ljava/lang/Object;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/whatsapp/ac;->publishProgress([Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Object;)Lcom/whatsapp/xf;
    .locals 6
    .parameter

    .prologue
    const/4 v4, 0x1

    .line 30
    sget-object v1, Lcom/whatsapp/xf;->a:Lcom/whatsapp/xf;

    .line 25
    new-instance v0, Lcom/whatsapp/i6;

    invoke-direct {v0, p0}, Lcom/whatsapp/i6;-><init>(Lcom/whatsapp/ac;)V

    .line 15
    :try_start_0
    sget-object v2, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-boolean v3, p0, Lcom/whatsapp/ac;->b:Z

    invoke-virtual {v2, v3, v0}, Lcom/whatsapp/fq;->a(ZLcom/whatsapp/rq;)Lcom/whatsapp/xf;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 23
    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x0

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {p0, v1}, Lcom/whatsapp/ac;->publishProgress([Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 32
    :goto_0
    return-object v0

    .line 3
    :catch_0
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    .line 38
    :goto_1
    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 11
    iput-boolean v4, p0, Lcom/whatsapp/ac;->a:Z

    goto :goto_0

    .line 3
    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method protected a(Lcom/whatsapp/xf;)V
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 7
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->j:Lcom/whatsapp/f;

    if-eqz v0, :cond_0

    .line 34
    iget-object v0, p0, Lcom/whatsapp/ac;->c:Lcom/whatsapp/VerifyMessageStoreActivity;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->removeDialog(I)V

    .line 41
    sput-object v2, Lcom/whatsapp/VerifyMessageStoreActivity;->j:Lcom/whatsapp/f;

    .line 12
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v0}, Lcom/whatsapp/fq;->a()V

    .line 14
    sget-object v0, Lcom/whatsapp/xf;->a:Lcom/whatsapp/xf;

    if-eq p1, v0, :cond_2

    .line 17
    sget-object v0, Lcom/whatsapp/ac;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/whatsapp/ac;->c:Lcom/whatsapp/VerifyMessageStoreActivity;

    invoke-virtual {v0}, Lcom/whatsapp/VerifyMessageStoreActivity;->d()V

    .line 18
    iget-object v0, p0, Lcom/whatsapp/ac;->c:Lcom/whatsapp/VerifyMessageStoreActivity;

    iget-boolean v0, v0, Lcom/whatsapp/VerifyMessageStoreActivity;->k:Z

    if-nez v0, :cond_1

    .line 29
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v0}, Lcom/whatsapp/App;->m(Landroid/content/Context;)V

    .line 22
    :cond_1
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v0, v2}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/tq;)V

    .line 13
    invoke-static {}, Lcom/whatsapp/App;->B()V

    .line 39
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->O()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_3

    .line 24
    :cond_2
    sget-object v0, Lcom/whatsapp/ac;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 8
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/ac;->c:Lcom/whatsapp/VerifyMessageStoreActivity;

    iget-boolean v0, v0, Lcom/whatsapp/VerifyMessageStoreActivity;->k:Z

    if-nez v0, :cond_4

    .line 2
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v0}, Lcom/whatsapp/messaging/MessageService;->a(Landroid/content/Context;)V

    .line 35
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/ac;->c:Lcom/whatsapp/VerifyMessageStoreActivity;

    iget-boolean v0, v0, Lcom/whatsapp/VerifyMessageStoreActivity;->k:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lcom/whatsapp/ac;->b:Z

    if-eqz v0, :cond_5

    .line 19
    invoke-static {}, Lcom/whatsapp/wallpaper/l;->e()V

    .line 43
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/ac;->c:Lcom/whatsapp/VerifyMessageStoreActivity;

    invoke-virtual {v0}, Lcom/whatsapp/VerifyMessageStoreActivity;->e()V

    .line 21
    iget-object v0, p0, Lcom/whatsapp/ac;->c:Lcom/whatsapp/VerifyMessageStoreActivity;

    invoke-virtual {v0}, Lcom/whatsapp/VerifyMessageStoreActivity;->f()V

    .line 20
    return-void
.end method

.method public varargs a([Ljava/lang/Integer;)V
    .locals 2
    .parameter

    .prologue
    .line 16
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->j:Lcom/whatsapp/f;

    if-eqz v0, :cond_0

    .line 4
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->j:Lcom/whatsapp/f;

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/f;->setProgress(I)V

    .line 27
    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 36
    invoke-virtual {p0, p1}, Lcom/whatsapp/ac;->a([Ljava/lang/Object;)Lcom/whatsapp/xf;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    check-cast p1, Lcom/whatsapp/xf;

    invoke-virtual {p0, p1}, Lcom/whatsapp/ac;->a(Lcom/whatsapp/xf;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 31
    iget-object v0, p0, Lcom/whatsapp/ac;->c:Lcom/whatsapp/VerifyMessageStoreActivity;

    invoke-virtual {v0}, Lcom/whatsapp/VerifyMessageStoreActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/whatsapp/ac;->c:Lcom/whatsapp/VerifyMessageStoreActivity;

    iget-boolean v0, v0, Lcom/whatsapp/VerifyMessageStoreActivity;->k:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/whatsapp/ac;->b:Z

    if-eqz v0, :cond_1

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ac;->c:Lcom/whatsapp/VerifyMessageStoreActivity;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->showDialog(I)V

    .line 33
    :cond_1
    return-void
.end method

.method public bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 26
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/whatsapp/ac;->a([Ljava/lang/Integer;)V

    return-void
.end method
