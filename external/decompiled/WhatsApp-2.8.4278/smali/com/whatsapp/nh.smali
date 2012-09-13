.class Lcom/whatsapp/nh;
.super Ljava/lang/Object;
.source "nh.java"

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
    .line 2
    iput-object p1, p0, Lcom/whatsapp/nh;->b:Lcom/whatsapp/mq;

    iput-object p2, p0, Lcom/whatsapp/nh;->a:Lcom/whatsapp/zq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 3
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v1, p0, Lcom/whatsapp/nh;->a:Lcom/whatsapp/zq;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/qp;->e(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 1
    return-void
.end method
