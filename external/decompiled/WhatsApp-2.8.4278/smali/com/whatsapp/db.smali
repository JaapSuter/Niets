.class Lcom/whatsapp/db;
.super Landroid/os/AsyncTask;
.source "db.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lcom/whatsapp/jq;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Landroid/app/ProgressDialog;

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:Lcom/whatsapp/sz;

.field final e:Lcom/whatsapp/Conversation;


# direct methods
.method public constructor <init>(Lcom/whatsapp/Conversation;Ljava/lang/String;ZLcom/whatsapp/sz;)V
    .locals 4
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x1

    .line 13
    iput-object p1, p0, Lcom/whatsapp/db;->e:Lcom/whatsapp/Conversation;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 16
    iput-object p2, p0, Lcom/whatsapp/db;->b:Ljava/lang/String;

    .line 14
    iput-boolean p3, p0, Lcom/whatsapp/db;->c:Z

    .line 28
    iput-object p4, p0, Lcom/whatsapp/db;->d:Lcom/whatsapp/sz;

    .line 25
    const-string v0, ""

    const v1, 0x7f0900f3

    invoke-virtual {p1, v1}, Lcom/whatsapp/Conversation;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v3, v2}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/db;->a:Landroid/app/ProgressDialog;

    .line 17
    iget-object v0, p0, Lcom/whatsapp/db;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 1
    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Lcom/whatsapp/jq;
    .locals 7
    .parameter

    .prologue
    .line 2
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v1, p0, Lcom/whatsapp/db;->e:Lcom/whatsapp/Conversation;

    iget-object v1, v1, Lcom/whatsapp/Conversation;->Qb:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/whatsapp/db;->d:Lcom/whatsapp/sz;

    iget-boolean v3, p0, Lcom/whatsapp/db;->c:Z

    iget-object v4, p0, Lcom/whatsapp/db;->b:Ljava/lang/String;

    const/16 v5, 0x64

    iget-object v6, p0, Lcom/whatsapp/db;->e:Lcom/whatsapp/Conversation;

    invoke-static {v6}, Lcom/whatsapp/Conversation;->z(Lcom/whatsapp/Conversation;)Lcom/whatsapp/sq;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Lcom/whatsapp/fq;->a(Ljava/lang/String;Lcom/whatsapp/sz;ZLjava/lang/String;ILcom/whatsapp/sq;)Lcom/whatsapp/jq;

    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/whatsapp/jq;->a:Landroid/database/Cursor;

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, v0, Lcom/whatsapp/jq;->a:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v1

    iget v2, v0, Lcom/whatsapp/jq;->b:I

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x32

    .line 10
    iget-object v2, v0, Lcom/whatsapp/jq;->a:Landroid/database/Cursor;

    const/4 v3, 0x0

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-interface {v2, v1}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 23
    :cond_0
    return-object v0
.end method

.method public a(Lcom/whatsapp/jq;)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x0

    .line 5
    iget-object v0, p0, Lcom/whatsapp/db;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 11
    invoke-virtual {p0}, Lcom/whatsapp/db;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 15
    if-eqz p1, :cond_1

    .line 27
    iget-object v0, p0, Lcom/whatsapp/db;->e:Lcom/whatsapp/Conversation;

    iget v1, p1, Lcom/whatsapp/jq;->b:I

    invoke-static {v0, v1}, Lcom/whatsapp/Conversation;->f(Lcom/whatsapp/Conversation;I)I

    .line 9
    iget-object v0, p1, Lcom/whatsapp/jq;->a:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    .line 12
    iget-object v0, p0, Lcom/whatsapp/db;->e:Lcom/whatsapp/Conversation;

    iget-object v1, p1, Lcom/whatsapp/jq;->a:Landroid/database/Cursor;

    invoke-static {v0, v1}, Lcom/whatsapp/Conversation;->a(Lcom/whatsapp/Conversation;Landroid/database/Cursor;)V

    .line 8
    iget-object v0, p0, Lcom/whatsapp/db;->e:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->z(Lcom/whatsapp/Conversation;)Lcom/whatsapp/sq;

    move-result-object v0

    invoke-interface {v0}, Lcom/whatsapp/sq;->a()V

    .line 26
    iget-object v0, p0, Lcom/whatsapp/db;->e:Lcom/whatsapp/Conversation;

    iget-object v0, v0, Lcom/whatsapp/Conversation;->Pb:Lcom/whatsapp/ue;

    iget-object v1, p1, Lcom/whatsapp/jq;->a:Landroid/database/Cursor;

    invoke-virtual {v0, v1}, Lcom/whatsapp/ue;->changeCursor(Landroid/database/Cursor;)V

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/db;->e:Lcom/whatsapp/Conversation;

    iget-object v0, v0, Lcom/whatsapp/Conversation;->Ib:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setTranscriptMode(I)V

    .line 22
    iget-object v0, p0, Lcom/whatsapp/db;->e:Lcom/whatsapp/Conversation;

    iget-object v0, v0, Lcom/whatsapp/Conversation;->Ib:Landroid/widget/ListView;

    iget v1, p1, Lcom/whatsapp/jq;->b:I

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 7
    iget-object v0, p0, Lcom/whatsapp/db;->e:Lcom/whatsapp/Conversation;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/whatsapp/Conversation;->a(Lcom/whatsapp/Conversation;Lcom/whatsapp/db;)Lcom/whatsapp/db;

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_2

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/db;->e:Lcom/whatsapp/Conversation;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/whatsapp/Conversation;->f(Lcom/whatsapp/Conversation;I)I

    .line 18
    iget-object v0, p0, Lcom/whatsapp/db;->e:Lcom/whatsapp/Conversation;

    invoke-virtual {v0}, Lcom/whatsapp/Conversation;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/db;->e:Lcom/whatsapp/Conversation;

    const v2, 0x7f0900f4

    invoke-virtual {v1, v2}, Lcom/whatsapp/Conversation;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 6
    :cond_2
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 3
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/db;->a([Ljava/lang/Void;)Lcom/whatsapp/jq;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 19
    check-cast p1, Lcom/whatsapp/jq;

    invoke-virtual {p0, p1}, Lcom/whatsapp/db;->a(Lcom/whatsapp/jq;)V

    return-void
.end method
