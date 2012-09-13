.class Lcom/whatsapp/r8;
.super Ljava/lang/Thread;
.source "r8.java"


# instance fields
.field final a:Lcom/whatsapp/yk;


# direct methods
.method constructor <init>(Lcom/whatsapp/yk;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/r8;->a:Lcom/whatsapp/yk;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 1
    const-wide/16 v0, 0x12c

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 5
    iget-object v0, p0, Lcom/whatsapp/r8;->a:Lcom/whatsapp/yk;

    iget-object v0, v0, Lcom/whatsapp/yk;->a:Lcom/whatsapp/Conversation;

    iget-object v1, p0, Lcom/whatsapp/r8;->a:Lcom/whatsapp/yk;

    iget-object v1, v1, Lcom/whatsapp/yk;->a:Lcom/whatsapp/Conversation;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->s(Lcom/whatsapp/Conversation;)Z

    move-result v1

    iget-object v2, p0, Lcom/whatsapp/r8;->a:Lcom/whatsapp/yk;

    iget-object v2, v2, Lcom/whatsapp/yk;->a:Lcom/whatsapp/Conversation;

    iget-object v2, v2, Lcom/whatsapp/Conversation;->Qb:Lcom/whatsapp/zq;

    iget-object v2, v2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/app/Activity;ZLjava/lang/String;)V
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
