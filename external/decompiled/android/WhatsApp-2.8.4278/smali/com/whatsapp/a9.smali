.class Lcom/whatsapp/a9;
.super Ljava/lang/Thread;
.source "a9.java"


# instance fields
.field a:Lcom/whatsapp/zq;

.field final b:Lcom/whatsapp/qp;


# direct methods
.method constructor <init>(Lcom/whatsapp/qp;Lcom/whatsapp/zq;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 15
    iput-object p1, p0, Lcom/whatsapp/a9;->b:Lcom/whatsapp/qp;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 6
    iput-object p2, p0, Lcom/whatsapp/a9;->a:Lcom/whatsapp/zq;

    .line 11
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/a9;->setPriority(I)V

    .line 12
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 18
    :try_start_0
    sget-object v0, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    iget-object v1, p0, Lcom/whatsapp/a9;->a:Lcom/whatsapp/zq;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/whatsapp/yp;->a(Lcom/whatsapp/App$Me;Lcom/whatsapp/zq;Lcom/whatsapp/vp;)V

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    iget-object v1, p0, Lcom/whatsapp/a9;->a:Lcom/whatsapp/zq;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    iget-object v1, p0, Lcom/whatsapp/a9;->a:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whatsapp/a9;->b:Lcom/whatsapp/qp;

    invoke-static {v1}, Lcom/whatsapp/qp;->a(Lcom/whatsapp/qp;)Lcom/whatsapp/xq;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/a9;->a:Lcom/whatsapp/zq;

    iget-object v2, v2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/whatsapp/xq;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/whatsapp/a9;->b:Lcom/whatsapp/qp;

    invoke-static {v1}, Lcom/whatsapp/qp;->a(Lcom/whatsapp/qp;)Lcom/whatsapp/xq;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/whatsapp/xq;->b(Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/a9;->a:Lcom/whatsapp/zq;

    iget-boolean v0, v0, Lcom/whatsapp/zq;->k:Z

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/whatsapp/a9;->a:Lcom/whatsapp/zq;

    invoke-static {v0}, Lcom/whatsapp/accountsync/PerformSyncManager;->a(Lcom/whatsapp/zq;)V

    .line 9
    sget-object v0, Lcom/whatsapp/App;->Ib:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 2
    iget-object v0, p0, Lcom/whatsapp/a9;->a:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1
    :cond_1
    sput-boolean v3, Lcom/whatsapp/tp;->a:Z

    .line 4
    :goto_0
    invoke-static {v3}, Lcom/whatsapp/g;->a(Z)V

    .line 14
    return-void

    .line 22
    :catch_0
    move-exception v0

    .line 10
    :try_start_1
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1
    sput-boolean v3, Lcom/whatsapp/tp;->a:Z

    goto :goto_0

    :catchall_0
    move-exception v0

    sput-boolean v3, Lcom/whatsapp/tp;->a:Z

    .line 4
    invoke-static {v3}, Lcom/whatsapp/g;->a(Z)V

    .line 1
    throw v0
.end method
