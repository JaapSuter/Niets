.class Lcom/whatsapp/lu;
.super Ljava/lang/Object;
.source "lu.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field final a:Lcom/whatsapp/GroupChatMap;


# direct methods
.method constructor <init>(Lcom/whatsapp/GroupChatMap;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/lu;->a:Lcom/whatsapp/GroupChatMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 10
    iget-object v0, p0, Lcom/whatsapp/lu;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v0, v4}, Lcom/whatsapp/GroupChatMap;->a(Lcom/whatsapp/GroupChatMap;Lcom/whatsapp/zq;)Lcom/whatsapp/zq;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 1
    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/whatsapp/lu;->a:Lcom/whatsapp/GroupChatMap;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/whatsapp/GroupChatMap;->a(Lcom/whatsapp/GroupChatMap;Ljava/lang/String;)Lcom/whatsapp/sz;

    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    iget-object v1, p0, Lcom/whatsapp/lu;->a:Lcom/whatsapp/GroupChatMap;

    sget-object v2, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v0, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v2, v0, v4}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/whatsapp/GroupChatMap;->a(Lcom/whatsapp/GroupChatMap;Lcom/whatsapp/zq;)Lcom/whatsapp/zq;

    .line 5
    iget-object v0, p0, Lcom/whatsapp/lu;->a:Lcom/whatsapp/GroupChatMap;

    invoke-virtual {v0, v3}, Lcom/whatsapp/GroupChatMap;->removeDialog(I)V

    .line 7
    iget-object v0, p0, Lcom/whatsapp/lu;->a:Lcom/whatsapp/GroupChatMap;

    invoke-virtual {v0, v3}, Lcom/whatsapp/GroupChatMap;->showDialog(I)V

    .line 6
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
