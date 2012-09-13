.class public Lcom/whatsapp/accountsync/d;
.super Landroid/os/AsyncTask;
.source "d.java"


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


# instance fields
.field final a:Lcom/whatsapp/accountsync/ProfileActivity;


# direct methods
.method public constructor <init>(Lcom/whatsapp/accountsync/ProfileActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/accountsync/d;->a:Lcom/whatsapp/accountsync/ProfileActivity;

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

    sget-boolean v2, Lcom/whatsapp/accountsync/PerformSyncManager;->b:Z

    move v0, v1

    .line 15
    :cond_0
    :goto_0
    sget-boolean v3, Lcom/whatsapp/eu;->j:Z

    if-eqz v3, :cond_1

    if-ge v0, v5, :cond_1

    .line 1
    add-int/lit16 v0, v0, 0xc8

    .line 13
    const-wide/16 v3, 0xc8

    :try_start_0
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 20
    :catch_0
    move-exception v3

    .line 10
    invoke-virtual {v3}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 11
    if-eqz v2, :cond_0

    .line 7
    :cond_1
    if-lt v0, v5, :cond_3

    .line 19
    sget-boolean v0, Lcom/whatsapp/eu;->f:Z

    if-eqz v0, :cond_2

    .line 16
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/whatsapp/eu;->a(Z)V

    if-eqz v2, :cond_3

    .line 21
    :cond_2
    invoke-static {v1}, Lcom/whatsapp/eu;->a(Z)V

    .line 12
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method protected a(Ljava/lang/Void;)V
    .locals 2
    .parameter

    .prologue
    .line 8
    iget-object v0, p0, Lcom/whatsapp/accountsync/d;->a:Lcom/whatsapp/accountsync/ProfileActivity;

    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Lcom/whatsapp/accountsync/ProfileActivity;->removeDialog(I)V

    .line 9
    iget-object v0, p0, Lcom/whatsapp/accountsync/d;->a:Lcom/whatsapp/accountsync/ProfileActivity;

    invoke-static {v0}, Lcom/whatsapp/accountsync/ProfileActivity;->a(Lcom/whatsapp/accountsync/ProfileActivity;)V

    .line 22
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 4
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/accountsync/d;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/accountsync/d;->a(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 14
    iget-object v0, p0, Lcom/whatsapp/accountsync/d;->a:Lcom/whatsapp/accountsync/ProfileActivity;

    invoke-virtual {v0}, Lcom/whatsapp/accountsync/ProfileActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 17
    iget-object v0, p0, Lcom/whatsapp/accountsync/d;->a:Lcom/whatsapp/accountsync/ProfileActivity;

    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Lcom/whatsapp/accountsync/ProfileActivity;->showDialog(I)V

    .line 18
    :cond_0
    return-void
.end method
