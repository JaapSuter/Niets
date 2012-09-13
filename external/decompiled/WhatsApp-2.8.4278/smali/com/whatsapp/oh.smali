.class Lcom/whatsapp/oh;
.super Ljava/lang/Object;
.source "oh.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/zq;

.field final b:Lcom/whatsapp/mq;


# direct methods
.method constructor <init>(Lcom/whatsapp/mq;Lcom/whatsapp/zq;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/oh;->b:Lcom/whatsapp/mq;

    iput-object p2, p0, Lcom/whatsapp/oh;->a:Lcom/whatsapp/zq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 1
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v1, p0, Lcom/whatsapp/oh;->a:Lcom/whatsapp/zq;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/qp;->d(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 2
    return-void
.end method
