.class public Lcom/whatsapp/lb;
.super Landroid/os/AsyncTask;
.source "lb.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/Main;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "k<R^&a2O_He)RF`r$"

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

    sput-object v0, Lcom/whatsapp/lb;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x9

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x6

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x5d

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x3b

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x30

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public constructor <init>(Lcom/whatsapp/Main;)V
    .locals 0
    .parameter

    .prologue
    .line 18
    iput-object p1, p0, Lcom/whatsapp/lb;->a:Lcom/whatsapp/Main;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 6
    .parameter

    .prologue
    const v5, 0xafc8

    const/4 v1, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    move v0, v1

    .line 5
    :cond_0
    :goto_0
    sget-boolean v3, Lcom/whatsapp/eu;->j:Z

    if-eqz v3, :cond_1

    if-ge v0, v5, :cond_1

    .line 20
    add-int/lit16 v0, v0, 0xc8

    .line 12
    const-wide/16 v3, 0xc8

    :try_start_0
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 17
    :catch_0
    move-exception v3

    .line 1
    invoke-virtual {v3}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 15
    if-eqz v2, :cond_0

    .line 11
    :cond_1
    if-lt v0, v5, :cond_3

    .line 13
    sget-boolean v0, Lcom/whatsapp/eu;->f:Z

    if-eqz v0, :cond_2

    .line 3
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/whatsapp/eu;->a(Z)V

    if-eqz v2, :cond_3

    .line 4
    :cond_2
    invoke-static {v1}, Lcom/whatsapp/eu;->a(Z)V

    .line 9
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method protected a(Ljava/lang/Void;)V
    .locals 2
    .parameter

    .prologue
    .line 19
    iget-object v0, p0, Lcom/whatsapp/lb;->a:Lcom/whatsapp/Main;

    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Lcom/whatsapp/Main;->removeDialog(I)V

    .line 22
    sget-object v0, Lcom/whatsapp/lb;->z:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/whatsapp/lb;->a:Lcom/whatsapp/Main;

    invoke-static {v0}, Lcom/whatsapp/Main;->b(Lcom/whatsapp/Main;)V

    .line 21
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 7
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/lb;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 8
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/lb;->a(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 14
    iget-object v0, p0, Lcom/whatsapp/lb;->a:Lcom/whatsapp/Main;

    invoke-virtual {v0}, Lcom/whatsapp/Main;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 10
    iget-object v0, p0, Lcom/whatsapp/lb;->a:Lcom/whatsapp/Main;

    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Lcom/whatsapp/Main;->showDialog(I)V

    .line 6
    :cond_0
    return-void
.end method
