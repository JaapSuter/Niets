.class Lcom/whatsapp/pq;
.super Lcom/whatsapp/lq;
.source "pq.java"


# instance fields
.field final a:Lcom/whatsapp/GroupChatMap;


# direct methods
.method constructor <init>(Lcom/whatsapp/GroupChatMap;)V
    .locals 0
    .parameter

    .prologue
    .line 8
    iput-object p1, p0, Lcom/whatsapp/pq;->a:Lcom/whatsapp/GroupChatMap;

    invoke-direct {p0}, Lcom/whatsapp/lq;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/sz;I)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 3
    if-eqz p1, :cond_1

    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v0, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/pq;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v1}, Lcom/whatsapp/GroupChatMap;->j(Lcom/whatsapp/GroupChatMap;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_1

    iget-byte v0, p1, Lcom/whatsapp/sz;->l:B

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/whatsapp/pq;->a:Lcom/whatsapp/GroupChatMap;

    iget-object v1, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whatsapp/GroupChatMap;->a(Lcom/whatsapp/GroupChatMap;Ljava/lang/String;)Lcom/whatsapp/sz;

    move-result-object v0

    .line 4
    if-eqz v0, :cond_0

    .line 7
    iget-object v1, p0, Lcom/whatsapp/pq;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v1}, Lcom/whatsapp/GroupChatMap;->f(Lcom/whatsapp/GroupChatMap;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/pq;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v0}, Lcom/whatsapp/GroupChatMap;->f(Lcom/whatsapp/GroupChatMap;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v0, p0, Lcom/whatsapp/pq;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v0}, Lcom/whatsapp/GroupChatMap;->k(Lcom/whatsapp/GroupChatMap;)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/pq;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v0}, Lcom/whatsapp/GroupChatMap;->l(Lcom/whatsapp/GroupChatMap;)Lcom/whatsapp/ff;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/ff;->a()V

    .line 6
    :cond_1
    return-void
.end method
