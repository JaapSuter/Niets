.class Lcom/whatsapp/vt;
.super Ljava/lang/Object;
.source "vt.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final a:Lcom/whatsapp/GroupChatInfo;


# direct methods
.method constructor <init>(Lcom/whatsapp/GroupChatInfo;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/vt;->a:Lcom/whatsapp/GroupChatInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 10
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 7
    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/whatsapp/vt;->a:Lcom/whatsapp/GroupChatInfo;

    iget-object v2, v2, Lcom/whatsapp/GroupChatInfo;->s:Ljava/util/HashMap;

    iget-object v3, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 11
    invoke-static {}, Lcom/whatsapp/App;->sb()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2
    iget-object v2, p0, Lcom/whatsapp/vt;->a:Lcom/whatsapp/GroupChatInfo;

    const/4 v3, 0x1

    invoke-virtual {v2, p2, v3}, Lcom/whatsapp/GroupChatInfo;->a(Landroid/view/View;Z)V

    .line 8
    new-instance v2, Lcom/whatsapp/m9;

    invoke-direct {v2, p0, v0}, Lcom/whatsapp/m9;-><init>(Lcom/whatsapp/vt;Lcom/whatsapp/zq;)V

    invoke-virtual {v2}, Lcom/whatsapp/m9;->start()V

    if-eqz v1, :cond_2

    .line 4
    :cond_0
    iget-object v2, p0, Lcom/whatsapp/vt;->a:Lcom/whatsapp/GroupChatInfo;

    iget-object v2, v2, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    iget-object v3, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/whatsapp/eu;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1
    iget-object v2, p0, Lcom/whatsapp/vt;->a:Lcom/whatsapp/GroupChatInfo;

    invoke-virtual {v2}, Lcom/whatsapp/GroupChatInfo;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f090275

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    if-eqz v1, :cond_2

    .line 3
    :cond_1
    if-eqz v0, :cond_2

    .line 5
    iget-object v1, p0, Lcom/whatsapp/vt;->a:Lcom/whatsapp/GroupChatInfo;

    iput-object v0, v1, Lcom/whatsapp/GroupChatInfo;->E:Lcom/whatsapp/zq;

    .line 9
    iget-object v0, p0, Lcom/whatsapp/vt;->a:Lcom/whatsapp/GroupChatInfo;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/whatsapp/GroupChatInfo;->showDialog(I)V

    .line 12
    :cond_2
    return-void
.end method
