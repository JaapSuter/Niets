.class Lcom/whatsapp/k9;
.super Ljava/lang/Thread;
.source "k9.java"


# instance fields
.field final a:Ljava/lang/String;

.field final b:Lcom/whatsapp/GroupChatInfo;


# direct methods
.method constructor <init>(Lcom/whatsapp/GroupChatInfo;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/k9;->b:Lcom/whatsapp/GroupChatInfo;

    iput-object p2, p0, Lcom/whatsapp/k9;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 5
    const-wide/16 v0, 0x12c

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 7
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 1
    iget-object v1, p0, Lcom/whatsapp/k9;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 3
    new-instance v1, Lcom/whatsapp/ju;

    iget-object v2, p0, Lcom/whatsapp/k9;->b:Lcom/whatsapp/GroupChatInfo;

    iget-object v2, v2, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    const/4 v3, 0x0

    const/16 v4, 0xe

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/whatsapp/ju;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;I)V

    .line 8
    invoke-static {v1}, Lcom/whatsapp/App;->b(Lcom/whatsapp/ju;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    :goto_0
    return-void

    .line 6
    :catch_0
    move-exception v0

    goto :goto_0
.end method
