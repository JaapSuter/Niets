.class final Lcom/whatsapp/l8;
.super Ljava/lang/Thread;
.source "l8.java"


# instance fields
.field final a:Lcom/whatsapp/zq;


# direct methods
.method constructor <init>(Lcom/whatsapp/zq;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/l8;->a:Lcom/whatsapp/zq;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 3
    :try_start_0
    sget-object v0, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    iget-object v1, p0, Lcom/whatsapp/l8;->a:Lcom/whatsapp/zq;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/whatsapp/yp;->a(Lcom/whatsapp/App$Me;Lcom/whatsapp/zq;Lcom/whatsapp/vp;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    :goto_0
    return-void

    .line 2
    :catch_0
    move-exception v0

    .line 7
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 5
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v1, p0, Lcom/whatsapp/l8;->a:Lcom/whatsapp/zq;

    invoke-virtual {v0, v1, v3}, Lcom/whatsapp/qp;->f(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V

    goto :goto_0
.end method
