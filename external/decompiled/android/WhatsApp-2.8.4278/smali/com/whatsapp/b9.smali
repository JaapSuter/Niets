.class Lcom/whatsapp/b9;
.super Ljava/lang/Thread;
.source "b9.java"


# instance fields
.field a:Lcom/whatsapp/zq;

.field final b:Lcom/whatsapp/qp;


# direct methods
.method constructor <init>(Lcom/whatsapp/qp;Lcom/whatsapp/zq;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/b9;->b:Lcom/whatsapp/qp;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 6
    iput-object p2, p0, Lcom/whatsapp/b9;->a:Lcom/whatsapp/zq;

    .line 2
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/b9;->setPriority(I)V

    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 14
    :try_start_0
    sget-object v0, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    iget-object v1, p0, Lcom/whatsapp/b9;->a:Lcom/whatsapp/zq;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/whatsapp/yp;->a(Lcom/whatsapp/App$Me;Lcom/whatsapp/zq;Lcom/whatsapp/vp;)V

    .line 7
    iget-object v0, p0, Lcom/whatsapp/b9;->a:Lcom/whatsapp/zq;

    invoke-static {v0}, Lcom/whatsapp/accountsync/PerformSyncManager;->a(Lcom/whatsapp/zq;)V

    .line 3
    sget-object v0, Lcom/whatsapp/App;->Ib:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    :goto_0
    sput-boolean v3, Lcom/whatsapp/tp;->a:Z

    .line 13
    return-void

    .line 12
    :catch_0
    move-exception v0

    .line 1
    :try_start_1
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 9
    :catchall_0
    move-exception v0

    sput-boolean v3, Lcom/whatsapp/tp;->a:Z

    throw v0
.end method
