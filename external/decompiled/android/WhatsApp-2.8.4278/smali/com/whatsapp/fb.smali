.class Lcom/whatsapp/fb;
.super Landroid/os/AsyncTask;
.source "fb.java"


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
.field final a:Lcom/whatsapp/m;


# direct methods
.method constructor <init>(Lcom/whatsapp/m;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/fb;->a:Lcom/whatsapp/m;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 6
    .parameter

    .prologue
    const/4 v5, 0x0

    sget v0, Lcom/whatsapp/yq;->e:I

    .line 13
    iget-object v1, p0, Lcom/whatsapp/fb;->a:Lcom/whatsapp/m;

    invoke-static {v1}, Lcom/whatsapp/m;->a(Lcom/whatsapp/m;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/xq;->l:Ljava/lang/String;

    invoke-virtual {v1, v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 17
    if-eqz v1, :cond_3

    .line 9
    :cond_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 5
    new-instance v2, Lcom/whatsapp/zq;

    invoke-direct {v2, v1}, Lcom/whatsapp/zq;-><init>(Landroid/database/Cursor;)V

    .line 15
    invoke-virtual {v2}, Lcom/whatsapp/zq;->o()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lcom/whatsapp/zq;->p()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, v2, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v3, :cond_1

    .line 1
    invoke-virtual {v2}, Lcom/whatsapp/zq;->c()V

    .line 16
    sget-object v3, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4}, Lcom/whatsapp/qp;->c(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    :cond_1
    if-eqz v0, :cond_0

    .line 12
    :cond_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 2
    :cond_3
    return-object v5

    .line 11
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method protected a(Ljava/lang/Void;)V
    .locals 0
    .parameter

    .prologue
    .line 14
    invoke-static {}, Lcom/whatsapp/App;->m()V

    .line 4
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 3
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/fb;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 7
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/fb;->a(Ljava/lang/Void;)V

    return-void
.end method
