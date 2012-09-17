.class Lcom/whatsapp/oq;
.super Lcom/whatsapp/lq;
.source "oq.java"


# instance fields
.field final a:Lcom/whatsapp/GroupChatInfo;


# direct methods
.method constructor <init>(Lcom/whatsapp/GroupChatInfo;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/oq;->a:Lcom/whatsapp/GroupChatInfo;

    invoke-direct {p0}, Lcom/whatsapp/lq;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/sz;I)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 2
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v0, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/oq;->a:Lcom/whatsapp/GroupChatInfo;

    iget-object v1, v1, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_0

    iget-byte v0, p1, Lcom/whatsapp/sz;->l:B

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/whatsapp/oq;->a:Lcom/whatsapp/GroupChatInfo;

    invoke-static {v0}, Lcom/whatsapp/GroupChatInfo;->c(Lcom/whatsapp/GroupChatInfo;)V

    .line 4
    :cond_0
    return-void
.end method
