.class Lcom/whatsapp/x8;
.super Ljava/lang/Thread;
.source "x8.java"


# instance fields
.field final a:Lcom/whatsapp/jo;


# direct methods
.method constructor <init>(Lcom/whatsapp/jo;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/x8;->a:Lcom/whatsapp/jo;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 3
    const-wide/16 v0, 0x12c

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 1
    invoke-static {}, Lcom/whatsapp/Conversations;->l()Lcom/whatsapp/zq;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/App;->k(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    :goto_0
    return-void

    .line 4
    :catch_0
    move-exception v0

    goto :goto_0
.end method
