.class Lcom/whatsapp/bb;
.super Landroid/os/AsyncTask;
.source "bb.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/os/Handler;

.field private c:Ljava/lang/Runnable;

.field private d:J

.field final e:Lcom/whatsapp/Conversation;


# direct methods
.method public constructor <init>(Lcom/whatsapp/Conversation;Ljava/lang/String;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/bb;->e:Lcom/whatsapp/Conversation;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 12
    iput-object p2, p0, Lcom/whatsapp/bb;->a:Ljava/lang/String;

    .line 15
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/whatsapp/bb;->d:J

    .line 18
    return-void
.end method

.method static a(Lcom/whatsapp/bb;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 16
    iget-object v0, p0, Lcom/whatsapp/bb;->a:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 7
    iget-object v0, p0, Lcom/whatsapp/bb;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/eu;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 17
    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 1
    iget-object v0, p0, Lcom/whatsapp/bb;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 11
    iget-object v0, p0, Lcom/whatsapp/bb;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whatsapp/bb;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2
    :cond_0
    iput-object v2, p0, Lcom/whatsapp/bb;->b:Landroid/os/Handler;

    .line 10
    iput-object v2, p0, Lcom/whatsapp/bb;->c:Ljava/lang/Runnable;

    .line 14
    return-void
.end method

.method protected a(Ljava/lang/String;)V
    .locals 6
    .parameter

    .prologue
    .line 19
    iget-object v0, p0, Lcom/whatsapp/bb;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/bb;->e:Lcom/whatsapp/Conversation;

    iget-object v1, v1, Lcom/whatsapp/Conversation;->Qb:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/bb;->b:Landroid/os/Handler;

    .line 13
    new-instance v0, Lcom/whatsapp/ln;

    invoke-direct {v0, p0, p1}, Lcom/whatsapp/ln;-><init>(Lcom/whatsapp/bb;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whatsapp/bb;->c:Ljava/lang/Runnable;

    .line 5
    iget-object v0, p0, Lcom/whatsapp/bb;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whatsapp/bb;->c:Ljava/lang/Runnable;

    iget-wide v2, p0, Lcom/whatsapp/bb;->d:J

    const-wide/16 v4, 0xbb8

    add-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    .line 8
    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 9
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/bb;->a([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/whatsapp/bb;->a(Ljava/lang/String;)V

    return-void
.end method
