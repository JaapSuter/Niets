.class final Lcom/whatsapp/u;
.super Landroid/os/AsyncTask;
.source "u.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "[B>;"
    }
.end annotation


# instance fields
.field final a:Lcom/whatsapp/sz;


# direct methods
.method constructor <init>(Lcom/whatsapp/sz;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/u;->a:Lcom/whatsapp/sz;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected a([B)V
    .locals 5
    .parameter

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 6
    iget-object v0, p0, Lcom/whatsapp/u;->a:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    .line 2
    iput-boolean v2, v0, Lcom/whatsapp/MediaData;->transferring:Z

    .line 10
    iget-object v0, p0, Lcom/whatsapp/u;->a:Lcom/whatsapp/sz;

    iput v1, v0, Lcom/whatsapp/sz;->h:I

    .line 5
    iget-object v0, p0, Lcom/whatsapp/u;->a:Lcom/whatsapp/sz;

    invoke-virtual {v0, p1}, Lcom/whatsapp/sz;->a([B)V

    .line 8
    sget-object v3, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v4, p0, Lcom/whatsapp/u;->a:Lcom/whatsapp/sz;

    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    const/4 v1, -0x1

    invoke-virtual {v3, v4, v0, v1}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;ZI)V

    .line 1
    return-void

    :cond_0
    move v0, v2

    .line 8
    goto :goto_0
.end method

.method protected varargs a([Ljava/lang/Void;)[B
    .locals 4
    .parameter

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/u;->a:Lcom/whatsapp/sz;

    iget-wide v0, v0, Lcom/whatsapp/sz;->q:D

    iget-object v2, p0, Lcom/whatsapp/u;->a:Lcom/whatsapp/sz;

    iget-wide v2, v2, Lcom/whatsapp/sz;->r:D

    invoke-static {v0, v1, v2, v3}, Lcom/whatsapp/mb;->a(DD)[B

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 9
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/u;->a([Ljava/lang/Void;)[B

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 7
    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/whatsapp/u;->a([B)V

    return-void
.end method
